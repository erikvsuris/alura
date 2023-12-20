<?php

for ($contador = 1; $contador <= 10; $contador++) {
	if ($contador == 3) continue;
	if ($contador == 7) break;
	echo "#$contador ";
}

// Saída: #1 #2 #4 #5 #6