
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
 * Class for caad.006.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rcncltnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caad.006.001.04")
public class MxCaad00600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RcncltnRspn", required = true)
    protected ReconciliationResponseV04 rcncltnRspn;
    public final static transient String BUSINESS_PROCESS = "caad";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalData2 .class, AdditionalFee3 .class, AdditionalFeeReconciliation3 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardServiceType4Code.class, CertificateIssuer1 .class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, CreditDebit3Code.class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData12 .class, ErrorDetails3 .class, FinancialReconciliation3 .class, GenericIdentification183 .class, Header71 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LocalData14 .class, MACData1 .class, MessageError1Code.class, MessageReconciliation3 .class, MxCaad00600104 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification286 .class, PartyType17Code.class, PartyType18Code.class, PartyType26Code.class, PartyType32Code.class, PartyType9Code.class, ProcessingResult23 .class, ProgrammeMode5 .class, ProtectedData2 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation4 .class, ReconciliationActivityType1Code.class, ReconciliationCategory1Code.class, ReconciliationFunction1Code.class, ReconciliationImpact1Code.class, ReconciliationMessageType2Code.class, ReconciliationResponseV04 .class, RelativeDistinguishedName1 .class, SettlementService6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability10 .class, TransactionTotals14 .class, TypeOfAmount21Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caad.006.001.04";

    public MxCaad00600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaad00600104(final String xml) {
        this();
        MxCaad00600104 tmp = parse(xml);
        rcncltnRspn = tmp.getRcncltnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaad00600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rcncltnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationResponseV04 }
     *     
     */
    public ReconciliationResponseV04 getRcncltnRspn() {
        return rcncltnRspn;
    }

    /**
     * Sets the value of the rcncltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationResponseV04 }
     *     
     */
    public MxCaad00600104 setRcncltnRspn(ReconciliationResponseV04 value) {
        this.rcncltnRspn = value;
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
    public static MxCaad00600104 parse(String xml) {
        return ((MxCaad00600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaad00600104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaad00600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaad00600104 parse(String xml, MxRead parserImpl) {
        return ((MxCaad00600104) parserImpl.read(MxCaad00600104 .class, xml, _classes));
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
     * Creates an MxCaad00600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaad00600104 message
     * @return
     *     a new instance of MxCaad00600104
     */
    public final static MxCaad00600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaad00600104 .class);
    }

}
