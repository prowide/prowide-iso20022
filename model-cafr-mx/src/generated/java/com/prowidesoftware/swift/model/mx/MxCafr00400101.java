
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for cafr.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "frdDspstnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafr.004.001.01")
public class MxCafr00400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FrdDspstnRspn", required = true)
    protected FraudDispositionResponseV01 frdDspstnRspn;
    public static final transient String BUSINESS_PROCESS = "cafr";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation22 .class, Address1 .class, BatchManagementInformation1 .class, CardData3 .class, CardProgrammeMode1 .class, Cardholder15 .class, CardholderName1 .class, Contact1 .class, ContentInformationType20 .class, Context8 .class, Credentials1 .class, Environment10 .class, FeeAmount2 .class, FraudDispositionResponse1 .class, FraudDispositionResponseV01 .class, GenericIdentification172 .class, Header48 .class, Identification2Code.class, MACData1 .class, MessageFunction29Code.class, MxCafr00400101 .class, OutputFormat4Code.class, PartyIdentification197 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, ProcessingResult4 .class, Response8Code.class, ResultData1 .class, ResultData5 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Token1 .class, Traceability7 .class, Transaction93 .class, TransactionContext5 .class, TypeOfAmount10Code.class, UserInterface8Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafr.004.001.01";

    public MxCafr00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafr00400101(final String xml) {
        this();
        MxCafr00400101 tmp = parse(xml);
        frdDspstnRspn = tmp.getFrdDspstnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafr00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the frdDspstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudDispositionResponseV01 }
     *     
     */
    public FraudDispositionResponseV01 getFrdDspstnRspn() {
        return frdDspstnRspn;
    }

    /**
     * Sets the value of the frdDspstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudDispositionResponseV01 }
     *     
     */
    public MxCafr00400101 setFrdDspstnRspn(FraudDispositionResponseV01 value) {
        this.frdDspstnRspn = value;
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
    public static MxCafr00400101 parse(String xml) {
        return ((MxCafr00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafr00400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafr00400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafr00400101 parse(String xml, MxRead parserImpl) {
        return ((MxCafr00400101) parserImpl.read(MxCafr00400101 .class, xml, _classes));
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
     * Creates an MxCafr00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafr00400101 message
     * @return
     *     a new instance of MxCafr00400101
     */
    public static final MxCafr00400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafr00400101 .class);
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
