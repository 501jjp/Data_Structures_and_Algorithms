<?php

class Arrays {
	private $arr;
	
	public function cin($a,$nu)
	{
		$this->arr = $a;
		$i = 0;
		$j = count($this->arr[0])-1;
		
		while($i<count($this->arr)&&$j>=0){
			$u = $i;
			$v = $j;
			if($nu==$this->arr[$u][$v]){
				return true;
			}
			
			if($nu>$this->arr[$u][$v]){
				$i++;
			}
			
			if($nu<$this->arr[$u][$v]){
				$j--;
			}
		}
		return false;
	}
}
