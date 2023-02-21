
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "QuoteSet2", propOrder = {
    "id",
    "vldUntilDtTm",
    "qtNtryDtls",
    "undrlygFinInstrm",
    "undrlygFinInstrmAttrbts",
    "undrlygStiptns"
})
public class QuoteSet2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "VldUntilDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldUntilDtTm;
    @XmlElement(name = "QtNtryDtls")
    protected List<QuoteEntry2> qtNtryDtls;
    @XmlElement(name = "UndrlygFinInstrm", required = true)
    protected List<SecurityIdentification7> undrlygFinInstrm;
    @XmlElement(name = "UndrlygFinInstrmAttrbts")
    protected FinancialInstrumentAttributes1 undrlygFinInstrmAttrbts;
    @XmlElement(name = "UndrlygStiptns")
    protected FinancialInstrumentStipulations undrlygStiptns;

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
    public QuoteSet2 setId(String value) {
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
    public XMLGregorianCalendar getVldUntilDtTm() {
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
    public QuoteSet2 setVldUntilDtTm(XMLGregorianCalendar value) {
        this.vldUntilDtTm = value;
        return this;
    }

    /**
     * Gets the value of the qtNtryDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtNtryDtls property.
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
     * {@link QuoteEntry2 }
     * 
     * 
     */
    public List<QuoteEntry2> getQtNtryDtls() {
        if (qtNtryDtls == null) {
            qtNtryDtls = new ArrayList<QuoteEntry2>();
        }
        return this.qtNtryDtls;
    }

    /**
     * Gets the value of the undrlygFinInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygFinInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     */
    public List<SecurityIdentification7> getUndrlygFinInstrm() {
        if (undrlygFinInstrm == null) {
            undrlygFinInstrm = new ArrayList<SecurityIdentification7>();
        }
        return this.undrlygFinInstrm;
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
    public QuoteSet2 setUndrlygFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
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
    public QuoteSet2 setUndrlygStiptns(FinancialInstrumentStipulations value) {
        this.undrlygStiptns = value;
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
    public QuoteSet2 addQtNtryDtls(QuoteEntry2 qtNtryDtls) {
        getQtNtryDtls().add(qtNtryDtls);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrm list.
     * @see #getUndrlygFinInstrm()
     * 
     */
    public QuoteSet2 addUndrlygFinInstrm(SecurityIdentification7 undrlygFinInstrm) {
        getUndrlygFinInstrm().add(undrlygFinInstrm);
        return this;
    }

}
