function removeButton() {
  const button = document.createElement("button");
  const td = document.createElement("td");
  const newRow = document.createElement("tr");
  newRow.appendChild(td);
  button.setAttribute("class", "remove-button");
  button.setAttribute("type", "button");
  button.innerHTML = 'Remover';
  td.appendChild(button);
  button.addEventListener('click', function() {
  const row = this.parentNode.parentNode;
  row.parentNode.removeChild(row);
  
  fetch('http://localhost:8080/pessoas/', {
        method: 'DELETE',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({id: row.firstElementChild.innerHTML})
    })
    .then(response => response.json())
    .then(response => console.log(response))
    .catch(error => error)
});
  return td;
}

fetch('http://localhost:8080/pessoas', {
 method: 'GET',
 headers: {
     'Content-Type': 'application/json'
  },
})
.then(response => response.json())
.then(data => {
  const tbody = document.querySelector("tbody");
  for (const pessoa of data) {
    const tr = document.createElement("tr");
    tr.innerHTML = `
      <td>${pessoa.id}</td>
      <td>${pessoa.nome}</td>
      <td>${pessoa.email}</td>
      <td>${pessoa.telefone}</td>
      <td>${pessoa.profissao}</td>
    `;
    tr.appendChild(removeButton());
    tbody.appendChild(tr);
  }
})
.catch(error => error)
