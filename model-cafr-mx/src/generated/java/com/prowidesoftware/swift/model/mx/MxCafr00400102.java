
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
 * Class for cafr.004.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "frdDspstnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02")
public class MxCafr00400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FrdDspstnRspn", required = true)
    protected FraudDispositionResponseV02 frdDspstnRspn;
    public final static transient String BUSINESS_PROCESS = "cafr";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee2 .class, AdditionalInformation30 .class, Address2 .class, Address3 .class, ApprovalEntity2 .class, Authority1 .class, BatchManagementInformation1 .class, CardData8 .class, CardProgrammeMode3 .class, Cardholder19 .class, CardholderName2 .class, CardholderName3 .class, Contact1 .class, ContentInformationType20 .class, Context17 .class, Credentials2 .class, CreditDebit3Code.class, Environment28 .class, ErrorDetails2 .class, FeeAmount3 .class, FraudDispositionResponse2 .class, FraudDispositionResponseV02 .class, GenericIdentification183 .class, Header66 .class, Identification3Code.class, Jurisdiction2 .class, LocalData1 .class, LocalData7 .class, MACData1 .class, MessageError1Code.class, MessageFunction29Code.class, MxCafr00400102 .class, OutputFormat4Code.class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, PartyType26Code.class, PartyType9Code.class, Priority3Code.class, ProcessingResult19 .class, ProtectionMethod1Code.class, Reconciliation3 .class, Response8Code.class, ResultData10 .class, ResultData7 .class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Token2 .class, Traceability9 .class, Transaction129 .class, TransactionContext10 .class, TypeOfAmount21Code.class, UserInterface8Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02";

    public MxCafr00400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafr00400102(final String xml) {
        this();
        MxCafr00400102 tmp = parse(xml);
        frdDspstnRspn = tmp.getFrdDspstnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafr00400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the frdDspstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudDispositionResponseV02 }
     *     
     */
    public FraudDispositionResponseV02 getFrdDspstnRspn() {
        return frdDspstnRspn;
    }

    /**
     * Sets the value of the frdDspstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudDispositionResponseV02 }
     *     
     */
    public MxCafr00400102 setFrdDspstnRspn(FraudDispositionResponseV02 value) {
        this.frdDspstnRspn = value;
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
    public static MxCafr00400102 parse(String xml) {
        return ((MxCafr00400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafr00400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafr00400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafr00400102 parse(String xml, MxRead parserImpl) {
        return ((MxCafr00400102) parserImpl.read(MxCafr00400102 .class, xml, _classes));
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
     * Creates an MxCafr00400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafr00400102 message
     * @return
     *     a new instance of MxCafr00400102
     */
    public final static MxCafr00400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafr00400102 .class);
    }

}
