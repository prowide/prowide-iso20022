
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
 * Attributes of a pension.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pension1", propOrder = {
    "id",
    "tp",
    "trfScp",
    "taxRef",
    "drwdwnTrchId",
    "addtlInf"
})
public class Pension1 {

    @XmlElement(name = "Id")
    protected PensionPolicy1 id;
    @XmlElement(name = "Tp")
    protected PensionSchemeType1Choice tp;
    @XmlElement(name = "TrfScp")
    protected PensionTransferScope1Choice trfScp;
    @XmlElement(name = "TaxRef")
    protected List<TaxReference1> taxRef;
    @XmlElement(name = "DrwdwnTrchId")
    protected String drwdwnTrchId;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PensionPolicy1 }
     *     
     */
    public PensionPolicy1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionPolicy1 }
     *     
     */
    public Pension1 setId(PensionPolicy1 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PensionSchemeType1Choice }
     *     
     */
    public PensionSchemeType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionSchemeType1Choice }
     *     
     */
    public Pension1 setTp(PensionSchemeType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the trfScp property.
     * 
     * @return
     *     possible object is
     *     {@link PensionTransferScope1Choice }
     *     
     */
    public PensionTransferScope1Choice getTrfScp() {
        return trfScp;
    }

    /**
     * Sets the value of the trfScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionTransferScope1Choice }
     *     
     */
    public Pension1 setTrfScp(PensionTransferScope1Choice value) {
        this.trfScp = value;
        return this;
    }

    /**
     * Gets the value of the taxRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReference1 }
     * 
     * 
     * @return
     *     The value of the taxRef property.
     */
    public List<TaxReference1> getTaxRef() {
        if (taxRef == null) {
            taxRef = new ArrayList<>();
        }
        return this.taxRef;
    }

    /**
     * Gets the value of the drwdwnTrchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrwdwnTrchId() {
        return drwdwnTrchId;
    }

    /**
     * Sets the value of the drwdwnTrchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Pension1 setDrwdwnTrchId(String value) {
        this.drwdwnTrchId = value;
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
     * Adds a new item to the taxRef list.
     * @see #getTaxRef()
     * 
     */
    public Pension1 addTaxRef(TaxReference1 taxRef) {
        getTaxRef().add(taxRef);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Pension1 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
