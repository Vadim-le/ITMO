public enum Location {
    FOREST{
        @Override
        public String toString() {
            return "to forest ";
        }
    },

    PILLAR{
        @Override
        public String toString(){
            return "to top of dirty and slippery pillar ";
        }
    },
    BETWEEN{
        @Override
        public String toString() {
            return "to between the trees ";
        }
    },
    GARDEN {
        @Override
        public String toString () {
            return " garden ";
        }
    },
    AWAY {
        @Override
        public String toString () {
            return " run away ";
        }
    }
}

