function validate() {
	var name = document.getElementById("name");
	if (name.value == '') {
		// TODO may add checks here
		return true;
	} else {
		return true;
	}
}

function focusOnInputBox(){
	var name = document.getElementById("name");
	if(shallFocusOnInputBox==true){
		name.focus();
	}
}
