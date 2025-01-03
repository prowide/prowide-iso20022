
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
 * Information about a cash forecast report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundDetailedConfirmedCashForecastReport2", propOrder = {
    "fndCshFcstDtls",
    "cnsltdNetCshFcst",
    "xtnsn"
})
public class FundDetailedConfirmedCashForecastReport2 {

    @XmlElement(name = "FndCshFcstDtls", required = true)
    protected List<FundCashForecast4> fndCshFcstDtls;
    @XmlElement(name = "CnsltdNetCshFcst")
    protected NetCashForecast3 cnsltdNetCshFcst;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the fndCshFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fndCshFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndCshFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundCashForecast4 }
     * 
     * 
     * @return
     *     The value of the fndCshFcstDtls property.
     */
    public List<FundCashForecast4> getFndCshFcstDtls() {
        if (fndCshFcstDtls == null) {
            fndCshFcstDtls = new ArrayList<>();
        }
        return this.fndCshFcstDtls;
    }

    /**
     * Gets the value of the cnsltdNetCshFcst property.
     * 
     * @return
     *     possible object is
     *     {@link NetCashForecast3 }
     *     
     */
    public NetCashForecast3 getCnsltdNetCshFcst() {
        return cnsltdNetCshFcst;
    }

    /**
     * Sets the value of the cnsltdNetCshFcst property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetCashForecast3 }
     *     
     */
    public FundDetailedConfirmedCashForecastReport2 setCnsltdNetCshFcst(NetCashForecast3 value) {
        this.cnsltdNetCshFcst = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
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
     * Adds a new item to the fndCshFcstDtls list.
     * @see #getFndCshFcstDtls()
     * 
     */
    public FundDetailedConfirmedCashForecastReport2 addFndCshFcstDtls(FundCashForecast4 fndCshFcstDtls) {
        getFndCshFcstDtls().add(fndCshFcstDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public FundDetailedConfirmedCashForecastReport2 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
