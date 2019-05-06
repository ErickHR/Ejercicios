SELECT 
	l.title Titulo, 
	l.quantity Cantidad, 
	l.year Anyo,
	a.nombre Autor, 
	e.nombre Editorial, 
p.nombre Pais
FROM autor a, editorial e, pais p, book l
WHERE
	a.idautor = l.id_autor and
	e.ideditorial = l.id_editorial and
	p.idpais = l.id_pais
ORDER BY a.nombre;
