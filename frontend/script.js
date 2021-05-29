function cadastrar() {
    // como consumir a API em js com AJAX 0 XMLHttpRequest
    // recupera dados do usuario
    let endereco = document.getElementById('endereco').value
    let nome = document.getElementById('nome').value
    let site = document.getElementById('site').value
    let creci = Number(document.getElementById('creci').value)

    // cria o objeto
    let imobiliaria = {
        endereco: endereco,
        nome: nome,
        site: site,
        creci: creci,
    }

    // consumir API
    let request = new XMLHttpRequest()
    // POST é o verbo e 'http://...' é o endereço onde está a API
    request.open('POST', 'http://localhost:8080/imobiliaria', true)
    
    // configurar o cabeçalho da requisição
    request.setRequestHeader('Content-Type', 'application/json')


    // enviar os dados
    request.send(JSON.stringify(imobiliaria))
    alert('Cadastro realizado com sucesso!')
    consulta()
}

function consulta() {
    let request = new XMLHttpRequest()
    request.open('GET', 'http://localhost:8080/imobiliaria', true)

    request.onload = function() {

        // this.response retorna todas as imobliarias
        // converte string em um objeto JSON
        let imobiliarias = JSON.parse(this.response)
        let acumulaSaida = ''
        imobiliarias.forEach(imobiliaria => {
            acumulaSaida = acumulaSaida + `
                <tr> <td> ${imobiliaria.nome} </td>
                <td> ${imobiliaria.endereco} </td>
                <td> ${imobiliaria.site} </td>
                <td> ${imobiliaria.site} </td>
                <td> <i class="bi bi-arrow-repeat"></i> </td>
                <td> <i class="bi bi-trash" onClick="remove(${imobiliaria.id})"></i> </td> </tr>
            `
        })

        // atribuir a acumulaSaida para a tabela
        document.getElementById('conteudoTabela').innerHTML = acumulaSaida
    }
    request.send()
}

function remove(id) {
    let request = new XMLHttpRequest()
    request.open('DELETE', `http://localhost:8080/imobiliaria/${id}`, true)
    request.send()
    alert('Remoção realizada com sucesso!')
    consulta()
}