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

    MOVE{
        @Override
        public String toString(){
            return "to move ";
        }
    }
}
