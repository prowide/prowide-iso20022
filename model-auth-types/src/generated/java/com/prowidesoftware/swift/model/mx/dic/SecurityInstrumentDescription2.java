
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.Calendar;
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
 * Identifies the security instrument by its name and typical characteristics.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityInstrumentDescription2", propOrder = {
    "desc",
    "clssfctnTp",
    "plcOfListg",
    "exrcDt",
    "mtrtyDt",
    "optnTp",
    "strkPric",
    "mltplr"
})
public class SecurityInstrumentDescription2 {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "ClssfctnTp")
    protected SecurityClassificationType1Choice clssfctnTp;
    @XmlElement(name = "PlcOfListg")
    protected String plcOfListg;
    @XmlElement(name = "ExrcDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar exrcDt;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar mtrtyDt;
    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionTypeCode optnTp;
    @XmlElement(name = "StrkPric")
    protected PriceRateOrAmountChoice strkPric;
    @XmlElement(name = "Mltplr")
    protected BigDecimal mltplr;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityInstrumentDescription2 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityClassificationType1Choice }
     *     
     */
    public SecurityClassificationType1Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityClassificationType1Choice }
     *     
     */
    public SecurityInstrumentDescription2 setClssfctnTp(SecurityClassificationType1Choice value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityInstrumentDescription2 setPlcOfListg(String value) {
        this.plcOfListg = value;
        return this;
    }

    /**
     * Gets the value of the exrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExrcDt() {
        return exrcDt;
    }

    /**
     * Sets the value of the exrcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityInstrumentDescription2 setExrcDt(Calendar value) {
        this.exrcDt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityInstrumentDescription2 setMtrtyDt(Calendar value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionTypeCode }
     *     
     */
    public OptionTypeCode getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionTypeCode }
     *     
     */
    public SecurityInstrumentDescription2 setOptnTp(OptionTypeCode value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public PriceRateOrAmountChoice getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public SecurityInstrumentDescription2 setStrkPric(PriceRateOrAmountChoice value) {
        this.strkPric = value;
        return this;
    }

    /**
     * Gets the value of the mltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMltplr() {
        return mltplr;
    }

    /**
     * Sets the value of the mltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecurityInstrumentDescription2 setMltplr(BigDecimal value) {
        this.mltplr = value;
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

}
