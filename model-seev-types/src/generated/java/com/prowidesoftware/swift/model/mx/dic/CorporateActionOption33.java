
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
 * Provides information about the corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption33", propOrder = {
    "optnNb",
    "optnTp",
    "sctiesMvmntDtls",
    "cshMvmntDtls"
})
public class CorporateActionOption33 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption8Choice optnTp;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecuritiesOption21> sctiesMvmntDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOption7> cshMvmntDtls;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public OptionNumber1Choice getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public CorporateActionOption33 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption8Choice }
     *     
     */
    public CorporateActionOption8Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption8Choice }
     *     
     */
    public CorporateActionOption33 setOptnTp(CorporateActionOption8Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOption21 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmntDtls property.
     */
    public List<SecuritiesOption21> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOption7 }
     * 
     * 
     * @return
     *     The value of the cshMvmntDtls property.
     */
    public List<CashOption7> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<>();
        }
        return this.cshMvmntDtls;
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
     * Adds a new item to the sctiesMvmntDtls list.
     * @see #getSctiesMvmntDtls()
     * 
     */
    public CorporateActionOption33 addSctiesMvmntDtls(SecuritiesOption21 sctiesMvmntDtls) {
        getSctiesMvmntDtls().add(sctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the cshMvmntDtls list.
     * @see #getCshMvmntDtls()
     * 
     */
    public CorporateActionOption33 addCshMvmntDtls(CashOption7 cshMvmntDtls) {
        getCshMvmntDtls().add(cshMvmntDtls);
        return this;
    }

}
