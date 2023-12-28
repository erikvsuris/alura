<?php

$quadroSocietario = [
	'12345678910' => ['socio' => 'João', 'cota' => 0.35],
	'12345678911' => ['socio' => 'Maria', 'cota' => 0.65]
];

echo $quadroSocietario['12345678910']['cota'];
// Saída: 0.35