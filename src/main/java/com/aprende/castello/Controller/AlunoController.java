package com.aprende.castello.Controller;

import com.aprende.castello.model.Aluno;
import com.aprende.castello.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.SplitPaneUI;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }
    @GetMapping
    public List<Aluno> buscarAlunos(){
        return service.ListaAluno();
    }
    @PostMapping
    public Aluno salvarAluno(@RequestBody Aluno novoAluno){
        return service.criarAluno(novoAluno);
    }
    @DeleteMapping("/id")
    public void excuirAluno(@PathVariable Long id){
        service.deletarAluno(id);
    }
    @GetMapping("/id")
    public Aluno buscaAlunoporId(@PathVariable Long id){
        return service.buscarAlunoId(id);
    }
}
