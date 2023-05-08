
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Identifies a group of related quotes. This can, for example be used to represent an option class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteSet1", propOrder = {
    "id",
    "vldUntilDtTm",
    "qtNtryDtls",
    "undrlygFinInstrm",
    "undrlygFinInstrmAttrbts",
    "undrlygStiptns",
    "qteeAcct"
})
public class QuoteSet1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "VldUntilDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar vldUntilDtTm;
    @XmlElement(name = "QtNtryDtls", required = true)
    protected List<QuoteEntry1> qtNtryDtls;
    @XmlElement(name = "UndrlygFinInstrm", required = true)
    protected SecurityIdentification7 undrlygFinInstrm;
    @XmlElement(name = "UndrlygFinInstrmAttrbts")
    protected FinancialInstrumentAttributes1 undrlygFinInstrmAttrbts;
    @XmlElement(name = "UndrlygStiptns")
    protected FinancialInstrumentStipulations undrlygStiptns;
    @XmlElement(name = "QteeAcct")
    protected SecuritiesAccount2 qteeAcct;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QuoteSet1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the vldUntilDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getVldUntilDtTm() {
        return vldUntilDtTm;
    }

    /**
     * Sets the value of the vldUntilDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QuoteSet1 setVldUntilDtTm(Calendar value) {
        this.vldUntilDtTm = value;
        return this;
    }

    /**
     * Gets the value of the qtNtryDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtNtryDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtNtryDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteEntry1 }
     * 
     * 
     * @return
     *     The value of the qtNtryDtls property.
     */
    public List<QuoteEntry1> getQtNtryDtls() {
        if (qtNtryDtls == null) {
            qtNtryDtls = new ArrayList<>();
        }
        return this.qtNtryDtls;
    }

    /**
     * Gets the value of the undrlygFinInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getUndrlygFinInstrm() {
        return undrlygFinInstrm;
    }

    /**
     * Sets the value of the undrlygFinInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public QuoteSet1 setUndrlygFinInstrm(SecurityIdentification7 value) {
        this.undrlygFinInstrm = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public FinancialInstrumentAttributes1 getUndrlygFinInstrmAttrbts() {
        return undrlygFinInstrmAttrbts;
    }

    /**
     * Sets the value of the undrlygFinInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public QuoteSet1 setUndrlygFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
        this.undrlygFinInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the undrlygStiptns property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public FinancialInstrumentStipulations getUndrlygStiptns() {
        return undrlygStiptns;
    }

    /**
     * Sets the value of the undrlygStiptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public QuoteSet1 setUndrlygStiptns(FinancialInstrumentStipulations value) {
        this.undrlygStiptns = value;
        return this;
    }

    /**
     * Gets the value of the qteeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public SecuritiesAccount2 getQteeAcct() {
        return qteeAcct;
    }

    /**
     * Sets the value of the qteeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public QuoteSet1 setQteeAcct(SecuritiesAccount2 value) {
        this.qteeAcct = value;
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
     * Adds a new item to the qtNtryDtls list.
     * @see #getQtNtryDtls()
     * 
     */
    public QuoteSet1 addQtNtryDtls(QuoteEntry1 qtNtryDtls) {
        getQtNtryDtls().add(qtNtryDtls);
        return this;
    }

}
