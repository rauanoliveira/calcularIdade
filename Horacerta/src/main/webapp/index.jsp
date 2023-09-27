<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CalcularIdade</title>
</head>
<body>
	<h1>Calculadora de Idade</h1>
	 <form action="calcularIdade" method="get">
        <label for="anoNascimento">Ano de Nascimento:</label>
        <input type="number" name="anoNascimento" id="anoNascimento" required><br>
        
        <label for="fezAniversario">Já fez aniversário este ano?</label>
        <input type="radio" name="fezAniversario" value="sim" required>Sim
        <input type="radio" name="fezAniversario" value="nao" required>Não<br>

        <input type="submit" value="Calcular Idade">
    </form>
</body>
</html>