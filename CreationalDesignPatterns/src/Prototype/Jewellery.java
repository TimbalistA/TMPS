package Prototype;

public abstract class Jewellery implements Cloneable {
        protected String jewelleryName;

        abstract void addJewellery();

        public Object clone()
        {
            Object clone = null;
            try
            {
                clone = super.clone();
            }
            catch (CloneNotSupportedException e)
            {
                e.printStackTrace();
            }
            return clone;
        }
    }
