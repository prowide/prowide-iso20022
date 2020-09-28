
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.090.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cshOblgtnStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1camt.090.001.01")
public class MxCamt09000101
    extends AbstractMX
{

    @XmlElement(name = "CshOblgtnStsAdvc", required = true)
    protected CashObligationStatusAdviceV01 cshOblgtnStsAdvc;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 90;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, CashAccount24 .class, CashAccountType2Choice.class, CashObligationHeader2 .class, CashObligationStatus1 .class, CashObligationStatusAdviceV01 .class, GenericAccountIdentification1 .class, MxCamt09000101 .class, OriginalBusinessReport1 .class, SettlementConditionModificationProcessingStatus1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1camt.090.001.01";

    public MxCamt09000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt09000101(final String xml) {
        this();
        MxCamt09000101 tmp = parse(xml);
        cshOblgtnStsAdvc = tmp.getCshOblgtnStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt09000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cshOblgtnStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CashObligationStatusAdviceV01 }
     *     
     */
    public CashObligationStatusAdviceV01 getCshOblgtnStsAdvc() {
        return cshOblgtnStsAdvc;
    }

    /**
     * Sets the value of the cshOblgtnStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashObligationStatusAdviceV01 }
     *     
     */
    public MxCamt09000101 setCshOblgtnStsAdvc(CashObligationStatusAdviceV01 value) {
        this.cshOblgtnStsAdvc = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCamt09000101 parse(String xml) {
        return ((MxCamt09000101) MxReadImpl.parse(MxCamt09000101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt09000101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt09000101) parserImpl.read(MxCamt09000101 .class, xml, _classes));
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
     * Creates an MxCamt09000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt09000101 message
     * @return
     *     a new instance of MxCamt09000101
     */
    public final static MxCamt09000101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt09000101 .class);
    }

}
