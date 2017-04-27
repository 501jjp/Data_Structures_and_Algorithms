<?php
require_once  "./Arrays.php";

$search = new Arrays();
$m = 1;
$arr = null;
for($i=0;$i<10;$i++){
    for($j=0;$j<10;$j++){
        $arr[$i][$j] = $m++;
    }
}
		
$anwserss = $search->cin($arr, 10);
if($anwserss){
    echo "true";
}else{
    echo "false";
}

