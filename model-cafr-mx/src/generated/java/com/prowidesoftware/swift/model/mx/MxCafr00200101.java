
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for cafr.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "frdRptgRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafr.002.001.01")
public class MxCafr00200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FrdRptgRspn", required = true)
    protected FraudReportingResponseV01 frdRptgRspn;
    public final static transient String BUSINESS_PROCESS = "cafr";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation22 .class, Address1 .class, BatchManagementInformation1 .class, CardData3 .class, CardProgrammeMode1 .class, Cardholder15 .class, CardholderName1 .class, Contact1 .class, ContentInformationType20 .class, Context8 .class, Credentials1 .class, Environment10 .class, FeeAmount2 .class, FraudReportingResponse1 .class, FraudReportingResponseV01 .class, GenericIdentification172 .class, Header48 .class, Identification2Code.class, MACData1 .class, MessageFunction29Code.class, MxCafr00200101 .class, OutputFormat4Code.class, PartyIdentification197 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, ProcessingResult4 .class, Response8Code.class, ResultData1 .class, ResultData5 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Token1 .class, Traceability7 .class, Transaction93 .class, TransactionContext5 .class, TypeOfAmount10Code.class, UserInterface8Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafr.002.001.01";

    public MxCafr00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafr00200101(final String xml) {
        this();
        MxCafr00200101 tmp = parse(xml);
        frdRptgRspn = tmp.getFrdRptgRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafr00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the frdRptgRspn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudReportingResponseV01 }
     *     
     */
    public FraudReportingResponseV01 getFrdRptgRspn() {
        return frdRptgRspn;
    }

    /**
     * Sets the value of the frdRptgRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudReportingResponseV01 }
     *     
     */
    public MxCafr00200101 setFrdRptgRspn(FraudReportingResponseV01 value) {
        this.frdRptgRspn = value;
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
    public static MxCafr00200101 parse(String xml) {
        return ((MxCafr00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafr00200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafr00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafr00200101 parse(String xml, MxRead parserImpl) {
        return ((MxCafr00200101) parserImpl.read(MxCafr00200101 .class, xml, _classes));
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
     * Creates an MxCafr00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafr00200101 message
     * @return
     *     a new instance of MxCafr00200101
     */
    public final static MxCafr00200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafr00200101 .class);
    }

}
