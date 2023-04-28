let fieldNames = ["nome", "email", "telefone", "profissao"];

function createInputTag(fieldName, index) {
	let header = document.getElementById('parent');
	let input = document.createElement('input');
	input.setAttribute('placeholder', fieldName);
	input.setAttribute('id', `input-data-${index}`);
	input.setAttribute('name', fieldName);
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
		createInputTag(fieldNames[index], index);
	}
	sendDataButton();
}


fillPlaceholders();


