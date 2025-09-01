
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about total instructed balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructedBalanceDetails7", propOrder = {
    "ttlInstdBal",
    "optnDtls"
})
public class InstructedBalanceDetails7 {

    @XmlElement(name = "TtlInstdBal", required = true)
    protected BalanceFormat5Choice ttlInstdBal;
    @XmlElement(name = "OptnDtls")
    protected List<InstructedCorporateActionOption8> optnDtls;

    /**
     * Gets the value of the ttlInstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getTtlInstdBal() {
        return ttlInstdBal;
    }

    /**
     * Sets the value of the ttlInstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public InstructedBalanceDetails7 setTtlInstdBal(BalanceFormat5Choice value) {
        this.ttlInstdBal = value;
        return this;
    }

    /**
     * Gets the value of the optnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructedCorporateActionOption8 }
     * 
     * 
     */
    public List<InstructedCorporateActionOption8> getOptnDtls() {
        if (optnDtls == null) {
            optnDtls = new ArrayList<InstructedCorporateActionOption8>();
        }
        return this.optnDtls;
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
     * Adds a new item to the optnDtls list.
     * @see #getOptnDtls()
     * 
     */
    public InstructedBalanceDetails7 addOptnDtls(InstructedCorporateActionOption8 optnDtls) {
        getOptnDtls().add(optnDtls);
        return this;
    }

}
