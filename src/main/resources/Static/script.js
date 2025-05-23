//Primeira navbar
import { Collapse, initMDB } from "mdb-ui-kit";

initMDB({ Collapse });



// Segunda Navbar
import { Dropdown, Collapse, initMDB } from "mdb-ui-kit";

initMDB({ Dropdown, Collapse });



// Chamada da API Aluno
document.addEventListener('DOMContentLoaded', () => {
  fetch('http://localhost:8080/alunos')
    .then(response => response.json())
    .then(data => {
      const tbody = document.getElementById('aluno-tbody');
      data.forEach(aluno => {
        const tr = document.createElement('tr');

        tr.innerHTML = `
          <td>${aluno.nome}</td>
          <td>${aluno.email}</td>
          <td>${aluno.telefone}</td>
        `;

        tbody.appendChild(tr);
      });
    })
    .catch(error => {
      console.error('Erro ao buscar alunos:', error);
      alert('Erro ao carregar a lista de alunos.');
    });
});