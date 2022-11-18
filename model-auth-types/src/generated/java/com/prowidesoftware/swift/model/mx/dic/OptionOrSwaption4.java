
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Option or swaption related attributes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionOrSwaption4", propOrder = {
    "optnTp",
    "strkPric",
    "optnExrcStyle",
    "mtrtyDtOfUndrlyg"
})
public class OptionOrSwaption4 {

    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionType2Code optnTp;
    @XmlElement(name = "StrkPric")
    protected SecuritiesTransactionPrice3Choice strkPric;
    @XmlElement(name = "OptnExrcStyle")
    @XmlSchemaType(name = "string")
    protected List<OptionStyle6Code> optnExrcStyle;
    @XmlElement(name = "MtrtyDtOfUndrlyg", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDtOfUndrlyg;

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType2Code }
     *     
     */
    public OptionType2Code getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType2Code }
     *     
     */
    public OptionOrSwaption4 setOptnTp(OptionType2Code value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice3Choice }
     *     
     */
    public SecuritiesTransactionPrice3Choice getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice3Choice }
     *     
     */
    public OptionOrSwaption4 setStrkPric(SecuritiesTransactionPrice3Choice value) {
        this.strkPric = value;
        return this;
    }

    /**
     * Gets the value of the optnExrcStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnExrcStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnExrcStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionStyle6Code }
     * 
     * 
     */
    public List<OptionStyle6Code> getOptnExrcStyle() {
        if (optnExrcStyle == null) {
            optnExrcStyle = new ArrayList<OptionStyle6Code>();
        }
        return this.optnExrcStyle;
    }

    /**
     * Gets the value of the mtrtyDtOfUndrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getMtrtyDtOfUndrlyg() {
        return mtrtyDtOfUndrlyg;
    }

    /**
     * Sets the value of the mtrtyDtOfUndrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionOrSwaption4 setMtrtyDtOfUndrlyg(XMLGregorianCalendar value) {
        this.mtrtyDtOfUndrlyg = value;
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
     * Adds a new item to the optnExrcStyle list.
     * @see #getOptnExrcStyle()
     * 
     */
    public OptionOrSwaption4 addOptnExrcStyle(OptionStyle6Code optnExrcStyle) {
        getOptnExrcStyle().add(optnExrcStyle);
        return this;
    }

}
