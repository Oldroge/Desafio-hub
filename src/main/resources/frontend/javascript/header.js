let fieldNames = ["Nome", "Email", "Telefone", "Profissão"];

function createInputTag(fieldName) {
	let header = document.getElementById('parent');
	let input = document.createElement('input');
	input.setAttribute('placeholder', fieldName);
	input.setAttribute('class', 'input-data');
	header.appendChild(input);
}

function sendDataButton() {
	let header = document.getElementById('parent');
	let button = document.createElement('button');
	button.setAttribute('type', 'submit');
	button.setAttribute('name', 'submit-button');
	button.setAttribute('value', 'submit');
	button.setAttribute('id', 'submit-button');
	button.innerHTML = 'Enviar';
	header.appendChild(button);
}

function fillPlaceholders() {
	for (let index = 0; index < fieldNames.length; index += 1) {
		createInputTag(fieldNames[index]);
	}
	sendDataButton();
}


fillPlaceholders();

