
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.040.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesAcctPosRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT3semt.040.001.01")
public class MxSemt04000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesAcctPosRspn", required = true)
    protected SecuritiesAccountPositionResponseV01 sctiesAcctPosRspn;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 40;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalBalanceInformation151 .class, AggregateBalanceInformation341 .class, Balance141 .class, Balance61 .class, Balance71 .class, Balance81 .class, Balance91 .class, BalanceQuantity8Choice1 .class, BalanceQuantity9Choice1 .class, DateAndDateTime1Choice1 .class, Exact4AlphaNumericTextT2S01 .class, FinancialInstrumentQuantity1Choice1 .class, GenericIdentification301Semt040Draft.class, GenericIdentification302Semt040Draft.class, GenericIdentification371 .class, MxSemt04000101 .class, Pagination.class, PartyIdentification1001 .class, PartyIdentification71Choice1 .class, Quantity6Choice1 .class, QuantityBreakdown271 .class, SecuritiesAccount191 .class, SecuritiesAccountPositionResponseV01 .class, SecuritiesBalanceType12Code1 .class, SecurityIdentification191 .class, ShortLong1Code.class, Statement581 .class, SubBalanceInformation151 .class, SubBalanceQuantity6Choice1 .class, SubBalanceType11Choice1 .class, SubBalanceType12Choice1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT3semt.040.001.01";

    public MxSemt04000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt04000101(final String xml) {
        this();
        MxSemt04000101 tmp = parse(xml);
        sctiesAcctPosRspn = tmp.getSctiesAcctPosRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt04000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesAcctPosRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountPositionResponseV01 }
     *     
     */
    public SecuritiesAccountPositionResponseV01 getSctiesAcctPosRspn() {
        return sctiesAcctPosRspn;
    }

    /**
     * Sets the value of the sctiesAcctPosRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountPositionResponseV01 }
     *     
     */
    public MxSemt04000101 setSctiesAcctPosRspn(SecuritiesAccountPositionResponseV01 value) {
        this.sctiesAcctPosRspn = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSemt04000101 parse(String xml) {
        return ((MxSemt04000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt04000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt04000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt04000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt04000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt04000101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt04000101) parserImpl.read(MxSemt04000101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSemt04000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt04000101 message
     * @return
     *     a new instance of MxSemt04000101
     */
    public static final MxSemt04000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt04000101 .class);
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
