
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
@XmlType(name = "ExpectedCollateralMovement1", propOrder = {
    "dlvry",
    "rtr"
})
public class ExpectedCollateralMovement1 {

    @XmlElement(name = "Dlvry")
    @XmlSchemaType(name = "string")
    protected List<CollateralType1Code> dlvry;
    @XmlElement(name = "Rtr")
    @XmlSchemaType(name = "string")
    protected List<CollateralType1Code> rtr;

    /**
     * Gets the value of the dlvry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvry property.
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
     * {@link CollateralType1Code }
     * 
     * 
     * @return
     *     The value of the dlvry property.
     */
    public List<CollateralType1Code> getDlvry() {
        if (dlvry == null) {
            dlvry = new ArrayList<>();
        }
        return this.dlvry;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtr property.
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
     * {@link CollateralType1Code }
     * 
     * 
     * @return
     *     The value of the rtr property.
     */
    public List<CollateralType1Code> getRtr() {
        if (rtr == null) {
            rtr = new ArrayList<>();
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
    public ExpectedCollateralMovement1 addDlvry(CollateralType1Code dlvry) {
        getDlvry().add(dlvry);
        return this;
    }

    /**
     * Adds a new item to the rtr list.
     * @see #getRtr()
     * 
     */
    public ExpectedCollateralMovement1 addRtr(CollateralType1Code rtr) {
        getRtr().add(rtr);
        return this;
    }

}
