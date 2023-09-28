<!DOCTYPE html>
<html lang="es" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Formulario de Registro de Producto</title>
</head>
<body>
    <h1>Formulario de Registro de Producto</h1>
    <form th:object="${producto}" th:action="@{/registrarProducto}" method="post">
        <div>
            <label for="idProducto">IdProducto:</label>
            <input type="text" id="idProducto" name="idProducto" th:field="*{idProducto}" />
            <span th:if="${#fields.hasErrors('idProducto')}" th:errors="*{idProducto}"></span>
        </div>

        <div>
            <label for="descripcion">Descripción:</label>
            <input type="text" id="descripcion" name="descripcion" th:field="*{descripcion}" />
            <span th:if="${#fields.hasErrors('descripcion')}" th:errors="*{descripcion}"></span>
        </div>

        <div>
            <label for="precioUnidad">Precio Unidad:</label>
            <input type="text" id="precioUnidad" name="precioUnidad" th:field="*{precioUnidad}" />
            <span th:if="${#fields.hasErrors('precioUnidad')}" th:errors="*{precioUnidad}"></span>
        </div>

        <div>
            <label for="stock">Stock:</label>
            <input type="text" id="stock" name="stock" th:field="*{stock}" />
            <span th:if="${#fields.hasErrors('stock')}" th:errors="*{stock}"></span>
        </div>

        <div>
            <label for="estado">Estado:</label>
            <input type="text" id="estado" name="estado" th:field="*{estado}" />
            <span th:if="${#fields.hasErrors('estado')}" th:errors="*{estado}"></span>
        </div>

        <button type="submit">Registrar</button>
    </form>
</body>
</html>
