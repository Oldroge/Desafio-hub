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
