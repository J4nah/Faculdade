select * from animais; -- exercicio 1

select * from animais where peso <50; -- exercicio 2

select * from animais where nasc between '2015-02-01' and '2015-12-31'; -- exercicio 3

select * from animais where cor = 'branco' and peso <20; -- exercicio 4

select nome, cor, peso from animais where nome like 'b%'; -- exercicio 5

select nome, cor, peso from animais where cor in('vermelho', 'amarelo', 'marrom', 'laranja'); -- exercicio 6

select * from animais order by nasc desc; -- exercicio 7

select * from animais where nome like 'c%' and cor != 'branco'; -- exercicio 8

select * from animais where nome like 'ba%'; -- exercicio 9

select * from animais where peso between '14.7' and '28.1'; -- exercicio 10

select * from animais where peso < 30 and cor in('amarelo' , 'roxo') and nasc > 2012-01-01; -- exercicio 11

select nome, day(nasc), month(nasc) from animais where month(nasc) = 12 and day(nasc) between 22 and 31 or month(nasc) = 01 and day(nasc) between 01 and 19; -- exercicio 12

select * from animais where nome like '% %'; -- exercicio 13












