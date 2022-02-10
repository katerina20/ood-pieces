package com.patterns.creational.builder.model;

public class Flower {

    private String name;
    private String genus;
    private String tribe;
    private String country;
    private Season season;
    private int leaves;
    private int buds;

    public static class Builder {

        private Flower flower;

        public Builder() {
            this.flower = new Flower();
        }

        public Builder name(String name) {
            flower.name = name;
            return this;
        }

        public Builder genus(String genus) {
            flower.genus = genus;
            return this;
        }

        public Builder tribe(String tribe) {
            flower.tribe = tribe;
            return this;
        }

        public Builder country(String country) {
            flower.country = country;
            return this;
        }

        public Builder season(Season season) {
            flower.season = season;
            return this;
        }

        public Builder leaves(int leaves) {
            flower.leaves = leaves;
            return this;
        }

        public Builder buds(int buds) {
            flower.buds = buds;
            return this;
        }

        public Flower build() {
            return this.flower;
        }
    }
}
