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