import React from 'react';
import Grid from '@material-ui/core/Grid';
import logo from '../../assets/woman.jpg';
import Product from './Product/Product';
import useStyles from './styles';

const Products = ({ products, onAddToCart }) => {
  const classes = useStyles();

  if (!products.length) return <p>Loading...</p>;

  return (
    <main className={classes.content}>
       <div className="ramu">
        <div className={classes.home}>
            <div class="buttons-group">
                <button>View Collection</button>
            </div>
            <img src={logo} alt="" className={classes.homeimg}/>
            <div> 
                <br/>
                <div className="title">
                    <h2>Products</h2>
                </div>
            </div>
        </div>
        </div>
      <div className={classes.toolbar} />
      <Grid container justify="center" spacing={4}>
        {products.map((product) => (
          <Grid key={product.id} item xs={12} sm={6} md={4} lg={3}>
            <Product product={product} onAddToCart={onAddToCart} />
          </Grid>
        ))}
      </Grid>
    </main>
  );
};

export default Products;

