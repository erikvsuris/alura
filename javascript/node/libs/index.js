import fs from 'fs';
import chalk from 'chalk';
import { log } from 'console';

fs.readFile('./arq.md', 'utf-8', (error, text) => {
    if (error) throw new Error(chalk.red(error.code, 'não há arquivo no diretório'));
    log(chalk.green(text));
});