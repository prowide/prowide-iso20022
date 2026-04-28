
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
 * Provides the transactions in the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesModification1__1", propOrder = {
    "acctOwnr",
    "sfkpgAcct",
    "prcgSts",
    "mod"
})
public class SecuritiesModification11 {

    @XmlElement(name = "AcctOwnr")
    protected SystemPartyIdentification81Draft acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount191 sfkpgAcct;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus71Choice1 prcgSts;
    @XmlElement(name = "Mod", required = true)
    protected List<SecuritiesModificationTransaction11> mod;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification81Draft }
     *     
     */
    public SystemPartyIdentification81Draft getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification81Draft }
     *     
     */
    public SecuritiesModification11 setAcctOwnr(SystemPartyIdentification81Draft value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount191 }
     *     
     */
    public SecuritiesAccount191 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount191 }
     *     
     */
    public SecuritiesModification11 setSfkpgAcct(SecuritiesAccount191 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus71Choice1 }
     *     
     */
    public ProcessingStatus71Choice1 getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus71Choice1 }
     *     
     */
    public SecuritiesModification11 setPrcgSts(ProcessingStatus71Choice1 value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesModificationTransaction11 }
     * 
     * 
     * @return
     *     The value of the mod property.
     */
    public List<SecuritiesModificationTransaction11> getMod() {
        if (mod == null) {
            mod = new ArrayList<>();
        }
        return this.mod;
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
     * Adds a new item to the mod list.
     * @see #getMod()
     * 
     */
    public SecuritiesModification11 addMod(SecuritiesModificationTransaction11 mod) {
        getMod().add(mod);
        return this;
    }

}
