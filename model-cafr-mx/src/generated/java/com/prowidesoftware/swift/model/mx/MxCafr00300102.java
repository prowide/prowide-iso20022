
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
 * Class for cafr.003.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "frdDspstnInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02")
public class MxCafr00300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FrdDspstnInitn", required = true)
    protected FraudDispositionInitiationV02 frdDspstnInitn;
    public final static transient String BUSINESS_PROCESS = "cafr";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActionTaken1Code.class, AdditionalData1 .class, AdditionalFee2 .class, AdditionalInformation30 .class, Address2 .class, Address3 .class, Authority1 .class, BatchManagementInformation1 .class, CardData8 .class, CardProgrammeMode3 .class, Cardholder19 .class, CardholderName2 .class, CardholderName3 .class, Contact1 .class, ContentInformationType20 .class, Context17 .class, Credentials2 .class, CreditDebit3Code.class, Environment28 .class, FeeAmount3 .class, FraudDispositionInitiation2 .class, FraudDispositionInitiationV02 .class, FraudDispositionStatus2 .class, FraudReportingAction1Code.class, FraudType1Code.class, GenericIdentification183 .class, Header66 .class, Identification3Code.class, Jurisdiction2 .class, LocalData1 .class, LocalData7 .class, MACData1 .class, MessageFunction29Code.class, MxCafr00300102 .class, OutputFormat4Code.class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, PartyType25Code.class, Priority3Code.class, ProtectionMethod1Code.class, Reconciliation3 .class, ReportedFraud2 .class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Token2 .class, Traceability9 .class, Transaction128 .class, TransactionContext10 .class, TypeOfAmount21Code.class, UserInterface8Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02";

    public MxCafr00300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafr00300102(final String xml) {
        this();
        MxCafr00300102 tmp = parse(xml);
        frdDspstnInitn = tmp.getFrdDspstnInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafr00300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the frdDspstnInitn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudDispositionInitiationV02 }
     *     
     */
    public FraudDispositionInitiationV02 getFrdDspstnInitn() {
        return frdDspstnInitn;
    }

    /**
     * Sets the value of the frdDspstnInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudDispositionInitiationV02 }
     *     
     */
    public MxCafr00300102 setFrdDspstnInitn(FraudDispositionInitiationV02 value) {
        this.frdDspstnInitn = value;
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
    public static MxCafr00300102 parse(String xml) {
        return ((MxCafr00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafr00300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafr00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafr00300102 parse(String xml, MxRead parserImpl) {
        return ((MxCafr00300102) parserImpl.read(MxCafr00300102 .class, xml, _classes));
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
     * Creates an MxCafr00300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafr00300102 message
     * @return
     *     a new instance of MxCafr00300102
     */
    public final static MxCafr00300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafr00300102 .class);
    }

}
