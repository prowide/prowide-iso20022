
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
 * Information about the beneficiary of a drawdown.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryDrawdown1", propOrder = {
    "bnfcryTp",
    "dthUdrLmt",
    "addtlInf"
})
public class BeneficiaryDrawdown1 {

    @XmlElement(name = "BnfcryTp")
    protected BeneficiaryType1Choice bnfcryTp;
    @XmlElement(name = "DthUdrLmt")
    protected Boolean dthUdrLmt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the bnfcryTp property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryType1Choice }
     *     
     */
    public BeneficiaryType1Choice getBnfcryTp() {
        return bnfcryTp;
    }

    /**
     * Sets the value of the bnfcryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryType1Choice }
     *     
     */
    public BeneficiaryDrawdown1 setBnfcryTp(BeneficiaryType1Choice value) {
        this.bnfcryTp = value;
        return this;
    }

    /**
     * Gets the value of the dthUdrLmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDthUdrLmt() {
        return dthUdrLmt;
    }

    /**
     * Sets the value of the dthUdrLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BeneficiaryDrawdown1 setDthUdrLmt(Boolean value) {
        this.dthUdrLmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public BeneficiaryDrawdown1 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
