let datas = {
	"nome": "",
	"email": "",
	"telefone": "",
	"profissao": ""
};

function addValue(objectKey, inputValue) {
	
	datas[objectKey] = inputValue;
}

for (let index = 0; index < fieldNames.length; index += 1) {
	let input = document.getElementById(`input-data-${index}`);
	input.addEventListener("input", () => {
		addValue(input.getAttribute('name'), input.value);
	})
};

let submitDatas = document.getElementById("submit-button");
submitDatas.addEventListener('click', () => {
    fetch('http://localhost:8080/pessoas/', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datas)
    })
    .then(response => response.json())
    .then(response => console.log(response))
    .catch(error => error)
});
