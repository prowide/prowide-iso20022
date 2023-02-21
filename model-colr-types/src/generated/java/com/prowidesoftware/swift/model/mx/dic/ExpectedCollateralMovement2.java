
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the expected collateral type and direction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedCollateralMovement2", propOrder = {
    "dlvry",
    "rtr"
})
public class ExpectedCollateralMovement2 {

    @XmlElement(name = "Dlvry")
    protected List<CollateralMovement9> dlvry;
    @XmlElement(name = "Rtr")
    protected List<CollateralMovement9> rtr;

    /**
     * Gets the value of the dlvry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlvry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralMovement9 }
     * 
     * 
     */
    public List<CollateralMovement9> getDlvry() {
        if (dlvry == null) {
            dlvry = new ArrayList<CollateralMovement9>();
        }
        return this.dlvry;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralMovement9 }
     * 
     * 
     */
    public List<CollateralMovement9> getRtr() {
        if (rtr == null) {
            rtr = new ArrayList<CollateralMovement9>();
        }
        return this.rtr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the dlvry list.
     * @see #getDlvry()
     * 
     */
    public ExpectedCollateralMovement2 addDlvry(CollateralMovement9 dlvry) {
        getDlvry().add(dlvry);
        return this;
    }

    /**
     * Adds a new item to the rtr list.
     * @see #getRtr()
     * 
     */
    public ExpectedCollateralMovement2 addRtr(CollateralMovement9 rtr) {
        getRtr().add(rtr);
        return this;
    }

}
