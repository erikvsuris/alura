export default async function validatedContent(content) {
    const links = extractLinks(content);
    const status = await checkStatus(links);
    
    return content.map((object, index) => ({...object, status: status[index]}));
}

function extractLinks(content) {
    return content
        .map(object => Object
        .values(object)
        .join());
}

async function checkStatus(links) {
    return await Promise.all(
        links.map(async url => {
            try {
                const response = await fetch(url);
                return response.status;
            } catch (error) {
                return handleError(error);
            }
    }));
}

function handleError(error) {
    if (error.cause.code === 'ENOTFOUND') {
        return 'Link not found';
    } else {
        return 'An error has occurred';
    }
}