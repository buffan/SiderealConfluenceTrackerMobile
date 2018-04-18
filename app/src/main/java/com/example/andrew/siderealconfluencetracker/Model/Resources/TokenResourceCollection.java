package com.example.andrew.siderealconfluencetracker.Model.Resources;

public class TokenResourceCollection {
    private int cylinder;
    private int blue;
    private int black;
    private int yellow;
    private int brown;
    private int white;
    private int green;
    private int ship;

    private TokenResourceCollection(TokenResourceCollectionBuilder builder)
    {
        this.cylinder = builder.cylinder;
        this.blue = builder.blue;
        this.black = builder.black;
        this.yellow = builder.yellow;
        this.brown = builder.brown;
        this.white = builder.white;
        this.green = builder.green;
        this.ship = builder.ship;
    }

    public static class TokenResourceCollectionBuilder
    {
        private int cylinder;
        private int blue;
        private int black;
        private int yellow;
        private int brown;
        private int white;
        private int green;
        private int ship;

        public TokenResourceCollectionBuilder()
        {
            cylinder = 0;
            blue = 0;
            black = 0;
            yellow = 0;
            brown = 0;
            white = 0;
            green = 0;
            ship = 0;
        }

            public TokenResourceCollectionBuilder setCylinder(int v)
            {
                this.cylinder = v;
                return this;
            }

            public TokenResourceCollectionBuilder setBlue(int v)
            {
                this.blue = v;
                return this;
            }

            public TokenResourceCollectionBuilder setBlack(int v)
            {
                this.black = v;
                return this;
            }

            public TokenResourceCollectionBuilder setYellow(int v)
            {
                this.yellow = v;
                return this;
            }

            public TokenResourceCollectionBuilder setBrown(int v)
            {
                this.brown = v;
                return this;
            }

            public TokenResourceCollectionBuilder setWhite(int v)
            {
                this.white = v;
                return this;
            }

            public TokenResourceCollectionBuilder setGreen(int v)
            {
                this.green = v;
                return this;
            }

            public TokenResourceCollectionBuilder setShip(int v)
            {
                this.ship = v;
                return this;
            }

            public TokenResourceCollection build()
            {
                return new TokenResourceCollection(this);
            }
    }

    //region Getter

    public int getResource(TokenResourceType resourceType)
    {
        switch(resourceType)
        {
            case SHIP: return getShip();
            case WHITE: return getWhite();
            case GREEN: return getGreen();
            case BROWN: return getBrown();
            case YELLOW: return getYellow();
            case BLACK: return getBlack();
            case BLUE: return getBlue();
            case CYLINDER: return getCylinder();
            default: throw new EnumConstantNotPresentException(TokenResourceType.class,
                    resourceType.toString());
        }
    }

    public int getCylinder()
    {
        return cylinder;
    }

    public int getBlue()
    {
        return blue;
    }

    public int getBlack()
    {
        return black;
    }

    public int getYellow()
    {
        return yellow;
    }

    public int getBrown()
    {
        return brown;
    }

    public int getWhite()
    {
        return white;
    }

    public int getGreen()
    {
        return green;
    }

    public int getShip()
    {
        return ship;
    }

    //endregion

    //region Setter

    public void setResource(TokenResourceType resourceType, int amount)
    {
        switch(resourceType)
        {
            case SHIP: setShip(amount); break;
            case WHITE: setWhite(amount); break;
            case GREEN: setGreen(amount); break;
            case BROWN: setBrown(amount); break;
            case YELLOW: setYellow(amount); break;
            case BLACK: setBlack(amount); break;
            case BLUE: setBlue(amount); break;
            case CYLINDER: setCylinder(amount); break;
            default: throw new EnumConstantNotPresentException(TokenResourceType.class,
                    resourceType.toString());
        }
    }

    public void setCylinder(int cylinder)
    {
        this.cylinder = cylinder;
    }

    public void setBlue(int blue)
    {
        this.blue = blue;
    }

    public void setBlack(int black)
    {
        this.black = black;
    }

    public void setYellow(int yellow)
    {
        this.yellow = yellow;
    }

    public void setBrown(int brown)
    {
        this.brown = brown;
    }

    public void setWhite(int white)
    {
        this.white = white;
    }

    public void setGreen(int green)
    {
        this.green = green;
    }

    public void setShip(int ship)
    {
        this.ship = ship;
    }


    //endregion

    public TokenResourceCollection add(TokenResourceCollection otherResources)
    {
        return new TokenResourceCollectionBuilder()
                .setCylinder(this.cylinder + otherResources.cylinder)
                .setBlue(this.blue + otherResources.blue)
                .setBlack(this.black + otherResources.black)
                .setYellow(this.yellow + otherResources.yellow)
                .setBrown(this.brown + otherResources.brown)
                .setWhite(this.white + otherResources.white)
                .setGreen(this.green + otherResources.green)
                .setShip(this.ship + otherResources.ship)
                .build();
    }

    public TokenResourceCollection subtract(TokenResourceCollection otherResources)
    {
        return new TokenResourceCollectionBuilder()
                .setCylinder(this.cylinder - otherResources.cylinder)
                .setBlue(this.blue - otherResources.blue)
                .setBlack(this.black - otherResources.black)
                .setYellow(this.yellow - otherResources.yellow)
                .setBrown(this.brown - otherResources.brown)
                .setWhite(this.white - otherResources.white)
                .setGreen(this.green - otherResources.green)
                .setShip(this.ship - otherResources.ship)
                .build();
    }

    public double getTotalTradeValue()
    {
        return this.cylinder*3
                + this.black*1.5
                + this.blue*1.5
                + this.yellow*1.5
                + this.green
                + this.white
                + this.brown;
    }

    public double getTotalPointValue()
    {
        return getTotalTradeValue()/6;
    }
    
    public void incrementResource(TokenResourceType resourceType)
    {
        switch(resourceType)
        {
            case CYLINDER:
                this.cylinder += 1;
                break;
            case BLUE: 
                this.blue += 1;
                break;
            case BLACK:
                this.black += 1;
                break;
            case YELLOW:
                this.yellow += 1;
                break;
            case BROWN:
                this.brown += 1;
                break;
            case GREEN:
                this.green += 1;
                break;
            case WHITE:
                this.white += 1;
                break;
            case SHIP:
                this.ship += 1;
                break;
            default:
                throw new EnumConstantNotPresentException(TokenResourceType.class,
                        resourceType.toString());
        }
    }
    
    public void decrementResource(TokenResourceType resourceType)
    {
        switch(resourceType)
        {
            case CYLINDER:
                this.cylinder -= 1;
                break;
            case BLUE:
                this.blue -= 1;
                break;
            case BLACK:
                this.black -= 1;
                break;
            case YELLOW:
                this.yellow -= 1;
                break;
            case BROWN:
                this.brown -= 1;
                break;
            case GREEN:
                this.green -= 1;
                break;
            case WHITE:
                this.white -= 1;
                break;
            case SHIP:
                this.ship -= 1;
                break;
            default:
                throw new EnumConstantNotPresentException(TokenResourceType.class,
                        resourceType.toString());
        }
    }


}
