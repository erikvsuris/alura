import fs from 'fs';
import chalk from 'chalk';
import { log } from 'console';

function readFile(path) {
    fs.promises
        .readFile(path, 'utf-8')
        .then((text) => log(chalk.green(text)))
        .catch((error) => handleError(error));
}

function handleError(error) {
    if (error)
        throw new Error(chalk.red(error));
}

readFile('./arq.md');

// fs.readFile('./arq.md', 'utf-8', (error, text) => {
//     if (error) throw new Error(chalk.red(error));
//     log(chalk.green(text));
// });