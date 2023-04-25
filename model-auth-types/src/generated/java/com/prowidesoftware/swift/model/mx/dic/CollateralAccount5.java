
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
 * Operational construct used by a central counterparty to record ownership of assets posted as collateral by clearing members to meet their obligations at the central counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAccount5", propOrder = {
    "id",
    "rltdMrgnAcct",
    "titlTrfCollArrgmnt",
    "collSgrtnByVal"
})
public class CollateralAccount5 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification118Choice id;
    @XmlElement(name = "RltdMrgnAcct", required = true)
    protected List<MarginAccount1> rltdMrgnAcct;
    @XmlElement(name = "TitlTrfCollArrgmnt")
    protected Boolean titlTrfCollArrgmnt;
    @XmlElement(name = "CollSgrtnByVal")
    protected Boolean collSgrtnByVal;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public PartyIdentification118Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public CollateralAccount5 setId(PartyIdentification118Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the rltdMrgnAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdMrgnAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdMrgnAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarginAccount1 }
     * 
     * 
     * @return
     *     The value of the rltdMrgnAcct property.
     */
    public List<MarginAccount1> getRltdMrgnAcct() {
        if (rltdMrgnAcct == null) {
            rltdMrgnAcct = new ArrayList<>();
        }
        return this.rltdMrgnAcct;
    }

    /**
     * Gets the value of the titlTrfCollArrgmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTitlTrfCollArrgmnt() {
        return titlTrfCollArrgmnt;
    }

    /**
     * Sets the value of the titlTrfCollArrgmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralAccount5 setTitlTrfCollArrgmnt(Boolean value) {
        this.titlTrfCollArrgmnt = value;
        return this;
    }

    /**
     * Gets the value of the collSgrtnByVal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollSgrtnByVal() {
        return collSgrtnByVal;
    }

    /**
     * Sets the value of the collSgrtnByVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralAccount5 setCollSgrtnByVal(Boolean value) {
        this.collSgrtnByVal = value;
        return this;
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
     * Adds a new item to the rltdMrgnAcct list.
     * @see #getRltdMrgnAcct()
     * 
     */
    public CollateralAccount5 addRltdMrgnAcct(MarginAccount1 rltdMrgnAcct) {
        getRltdMrgnAcct().add(rltdMrgnAcct);
        return this;
    }

}
