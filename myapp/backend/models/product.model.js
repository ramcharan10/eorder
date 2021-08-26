module.exports = (mongoose) => {
  const Product = mongoose.model(
    "product",
    mongoose.Schema(
      {
        productName: String,
        price: String,
        description: String,
        quantity: String,
        published: Boolean,
      },
      { timestamps: true }
    )
  );

  return Product;
};
