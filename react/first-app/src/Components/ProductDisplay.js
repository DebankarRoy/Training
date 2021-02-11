import axios from "axios";
import React, { Component } from "react";
import SpringBootServer from "../API/SpringBootServer";
import ReviewDisplay from "./ReviewDisplay";

class ProductDisplay extends Component {
	state = { reviews: [] };
	showReviews = () => {
		axios
			.get("http://localhost:8080/products/" + this.props.prod.id + "/reviews")
			.then((res) => {
				console.log(res);
				this.setState({ reviews: res.data });
			});
	};
	render() {
		//let product = this.prod.prod;
		return (
			<div>
				<div className="ui card">
					<div className="content">
						<a className="header">{this.props.prod.name}</a>
					</div>
					<div className="extra content">
						<a>{this.props.prod.price}</a>
					</div>
					<div className="extra content">
						<a>{this.props.prod.qoh}</a>
					</div>
					<button className="ui button" onClick={this.showReviews}>
						Show
					</button>
					<div className="extra content">
						{this.state.reviews.map((review) => {
							return <ReviewDisplay key={review.id} reviewInfo={review} />;
						})}
					</div>
				</div>
			</div>
		);
	}
}

export default ProductDisplay;
