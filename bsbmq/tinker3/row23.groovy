
x = TinkerGraph.open();
x.io(gryo()).readGraph("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().union( match( __.as('a').values('productTypeID').is(eq(13)), __.as('a').values('label_n').as('plabel'), __.as('a').out().as('prod'), __.as('prod').values('productID').as('pid'), __.as('prod').values('label_n').as('label'), __.as('prod').values('ProductPropertyTextual_1').as('propt1'), __.as('prod').values('ProductPropertyNumeric_1').is(gt(211)).as('propn1'), __.as('prod').values('comment').as('comment')), match( __.as('a').values('productTypeID').is(eq(102)), __.as('a').values('label_n').as('plabel'), __.as('a').out().as('prod'), __.as('prod').values('productID').as('pid'), __.as('prod').values('label_n').as('label'), __.as('prod').values('ProductPropertyTextual_1').as('propt1'), __.as('prod').values('ProductPropertyNumeric_2').is(gt(600)).as('propn1'), __.as('prod').values('comment').as('comment'))).select('a','plabel','pid','label','propt1', 'propn1','comment').limit(10)
println (System.currentTimeMillis() - q)
