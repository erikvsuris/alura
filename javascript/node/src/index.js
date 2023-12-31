import fs from 'fs';
import chalk from 'chalk';
import { log } from 'console';

// ASSÍNCRONA (async/await)
async function readFile(path) {
    try {
        const content = await fs.promises
            .readFile(path, 'utf-8');
        chalk.green(extractLinks(content));
    } catch (error) {
        handleError(error);
    }
}

function extractLinks(text) {
    const regex = /\[([^\[\]]*?)\]\((https?:\/\/[^\s?#.].[^\s]*)\)/gm;
    const matches = [...text.matchAll(regex)];
    const results = matches.map(match => (
        {[match[1]]: match[2]}
    ));
    log(results);
}

function handleError(error) {
    if (error)
        throw new Error(chalk.red(error));
}

// ASSÍNCRONA (then)
// function readFile(path) {
//     fs.promises
//         .readFile(path, 'utf-8')
//         .then((text) => log(chalk.green(text)))
//         .catch((error) => handleError(error));
// }

// SÍNCRONA
// fs.readFile('./arq.md', 'utf-8', (error, text) => {
//     if (error) throw new Error(chalk.red(error));
//     log(chalk.green(text));
// });

export default readFile;