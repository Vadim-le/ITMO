public enum Condition {

    SILENCE{
        @Override
        public String toString() {
            return "silence and immobility ";//безмолвие
        }
    },

    SCARY{
        @Override
        public String toString(){
            return " scary ";
        }
    },

    SHIVER{
        @Override
        public String toString(){
            return " shiver ";
        }
    },

    THOUGHTS{
        @Override
        public String toString(){
            return "thoughts when think about fall ";
        }
    },
    NERVOUS{
        @Override
        public String toString(){
            return "lost nerves ";
        }
    },
    CALM{
        @Override
        public String toString(){
            return "should be calm ";
        }
    };

    @Override
    public String toString() {
        return "Condition{}";
    }
}


