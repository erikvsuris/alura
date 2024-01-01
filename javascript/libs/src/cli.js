import fs from 'fs';
import chalk from 'chalk';
import { log } from 'console';
import validatedContent from "./validation.js";
import readFile from "./index.js";

printPathContent();

async function printPathContent() {
    const args = process.argv;
    const path = args[2];
    const isValid = args[3] === '--validate';

    try {
        fs.lstatSync(path);
    } catch (error) {
        handleENOENT(error);
        return;
    }

    if (fs.lstatSync(path).isFile()) {
        const content = await readFile(path);
        printFile(isValid, content);
    } else if (fs.lstatSync(path).isDirectory()) {
        const dir = await fs.promises
        .readdir(path);
        dir.forEach(async file => {
            const content = await readFile(`${path}/${file}`);
            printFile(isValid, content, file);
        });
    }
}

function handleENOENT(error) {
    if (error.code === 'ENOENT')
        log(chalk.red(error.message));
}

async function printFile(isValid, content, fileName = '') {
    if (isValid) {
        log(chalk.yellow(`Validated Content`),
        chalk.magenta(fileName),
        await validatedContent(content));
    } else {
        log(chalk.yellow(`Content`),
            chalk.magenta(fileName),
            content);
    }
}