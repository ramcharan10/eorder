const db = require("../models");
const Product = db.product;

//Create and Save a new Product
exports.create = (req, res) => {
  // Validate request
  if (!req.body.productName) {
    res.status(400).send({ message: "Content can not be empty!" });
    return;
  }

  // Create a product
  const product = new Product({
    title: req.body.productName,
    price: req.body.price,
    description: req.body.description,
    quantity: req.body.quantity,
    published: req.body.published ? req.body.published : false,
  });

  // Save product in the database
  product
    .save(product)
    .then((data) => {
      res.send(data);
    })
    .catch((err) => {
      res.status(500).send({
        message:
          err.message || "Some error occurred while creating the Tutorial.",
      });
    });
};

// Find a product
exports.findOne = (req, res) => {
  const id = req.params.id;

  Product.findbyId(id)
    .then((data) => {
      if (!data) res.status(404).send({ message: "Can't find product" });
      else res.send(data);
    })
    .catch((err) => {
      res.status(500).send({ message: "Error retrieving product" });
    });
};

// Update Information
exports.update = (req, res) => {
  if (!req.body) {
    return res.status(400).send({
      message: "Data to update can not be empty!",
    });
  }

  const id = req.params.id;

  Product.findByIdAndUpdate(id, req.body, { useFindAndModify: false })
    .then((data) => {
      if (!data) {
        res.status(404).send({
          message: `Cannot update!`,
        });
      } else res.send({ message: "Updated successfully." });
    })
    .catch((err) => {
      res.status(500).send({
        message: "Error updating!",
      });
    });
};

// Delete Information
exports.delete = (req, res) => {
  const id = req.params.id;

  Product.findByIdAndRemove(id)
    .then((data) => {
      if (!data) {
        res.status(404).send({
          message: `Cannot delete!`,
        });
      } else {
        res.send({
          message: "Deleted successfully!",
        });
      }
    })
    .catch((err) => {
      res.status(500).send({
        message: "Could not delete!",
      });
    });
};

// Delete all products
exports.deleteAll = (req, res) => {
  Product.deleteMany({})
    .then((data) => {
      res.send({
        message: `${data.deletedCount} Products were deleted successfully!`,
      });
    })
    .catch((err) => {
      res.status(500).send({
        message:
          err.message || "Some error occurred while removing all products.",
      });
    });
};

// Find all published products
exports.findAllPublished = (req, res) => {
  Product.find({ published: true })
    .then((data) => {
      res.send(data);
    })
    .catch((err) => {
      res.status(500).send({
        message:
          err.message || "Some error occurred while retrieving products.",
      });
    });
};
