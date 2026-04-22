
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "BeneficiaryDrawdown2", propOrder = {
    "bnfcryTp",
    "dthUdrLmt",
    "dtOfDth",
    "dtDsgntdToBnfcry",
    "addtlInf"
})
public class BeneficiaryDrawdown2 {

    @XmlElement(name = "BnfcryTp")
    protected BeneficiaryType1Choice bnfcryTp;
    @XmlElement(name = "DthUdrLmt")
    protected Boolean dthUdrLmt;
    @XmlElement(name = "DtOfDth", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtOfDth;
    @XmlElement(name = "DtDsgntdToBnfcry", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtDsgntdToBnfcry;
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
    public BeneficiaryDrawdown2 setBnfcryTp(BeneficiaryType1Choice value) {
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
    public BeneficiaryDrawdown2 setDthUdrLmt(Boolean value) {
        this.dthUdrLmt = value;
        return this;
    }

    /**
     * Gets the value of the dtOfDth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtOfDth() {
        return dtOfDth;
    }

    /**
     * Sets the value of the dtOfDth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BeneficiaryDrawdown2 setDtOfDth(LocalDate value) {
        this.dtOfDth = value;
        return this;
    }

    /**
     * Gets the value of the dtDsgntdToBnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtDsgntdToBnfcry() {
        return dtDsgntdToBnfcry;
    }

    /**
     * Sets the value of the dtDsgntdToBnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BeneficiaryDrawdown2 setDtDsgntdToBnfcry(LocalDate value) {
        this.dtDsgntdToBnfcry = value;
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
    public BeneficiaryDrawdown2 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
