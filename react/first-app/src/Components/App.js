import React, { Component } from "react";
// import MyTable from "./MyTable";
//import User from "./User";
//import "./User.css";
import ProductDisplay from "./ProductDisplay";
import SpringBootServer from "../API/SpringBootServer";
import axios from "axios";

class App extends Component {
	state = {
		data: [
			{ id: 1, name: "Debankar" },
			{ id: 2, name: "Rakuten" },
			{ id: 3, name: "kraze" },
			{ id: 4, name: "hulk" },
			{ id: 5, name: "zex" },
		],
		/*products: [
			{ id: 1, name: "Debankar", price: 10000, qoh: 10 },
			{ id: 2, name: "Rakuten", price: 10000, qoh: 10 },
			{ id: 3, name: "kraze", price: 10000, qoh: 10 },
			{ id: 4, name: "hulk", price: 10000, qoh: 10 },
			{ id: 5, name: "zex", price: 10000, qoh: 10 },
		],*/
		products: [],
	};

	componentDidMount() {
		// console.log("fetching position..");
		// window.navigator.geolocation.getCurrentPosition((position) => {
		// 	console.log("Latitude: ", position.coords.latitude);
		// 	console.log("Longitude: ", position.coords.longitude);
		// });
		// console.log("fetched position..");

		axios.get("http://localhost:8080/products").then((res) => {
			console.log(res);
			this.setState({ products: res.data });
		});
	}

	render() {
		return (
			<div>
				<h1>Hello!!</h1>
				{/* <User innerText={"property using here"} /> */}
				{/* <ProductDisplay /> */}

				{this.state.products.map((product) => {
					return <ProductDisplay key={product.id} prod={product} />;
				})}

				{/* {this.state.data.map((userobj) => {
					return (
						<User
							key={userobj.id}
							innerText={"coming from app js"}
							id={userobj.id}
							username={userobj.name}
						/>
					);
				})}
				<MyTable></MyTable> */}
			</div>
		);
	}
}

export default App;
